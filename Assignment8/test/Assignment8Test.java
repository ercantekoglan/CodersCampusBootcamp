import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class Assignment8Test {

	@Test
	void test() {

		Assignment8 assignment = new Assignment8();

		ExecutorService executor = Executors.newCachedThreadPool();

		List<CompletableFuture<Void>> tasks = Collections.synchronizedList(new ArrayList<>());
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			CompletableFuture<Void> task = CompletableFuture.supplyAsync(() -> assignment.getNumbers(), executor)
															.thenAccept(number -> numbers.addAll(number));
			tasks.add(task);
		}

		while (tasks.stream().filter(CompletableFuture::isDone).count() < 1000) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Map<Integer, Integer> frekans = new HashMap<>();

		for (Integer number : numbers) {
			
			if (!frekans.containsKey(number)) {
				frekans.put(number, 1);
			} else {
				frekans.put(number, frekans.get(number) + 1);
			}
		};
		System.out.println(frekans);

	}
}

