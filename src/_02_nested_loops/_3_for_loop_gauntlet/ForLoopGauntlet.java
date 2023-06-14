package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		System.out.println("Hello");
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println(
				"////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println(
				"/////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
		System.out.println(
				"/////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 1; i <= 99; i++) {
			System.out.println(i);
		}
		System.out.println(
				"////////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "even");
			} else {
				System.out.println(i + "odd");
			}
		}
		System.out.println(
				"/////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 0; i <= 777; i += 7) {
			System.out.println(i);
		}
		System.out.println(
				"/////////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 2012; i <= 2023; i++) {
			System.out.println("In " + i + ", I was " + (i - 2012));
		}
		System.out.println(
				"/////////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 0; i <= 2; i++) {
			for (int k = 0; k <= 2; k++) {
				System.out.println(i + " " + k);
			}
		}
		for (int i = 1; i <= 7; i += 3) {
			for (int k = 0; k <= 2; k++) {
				System.out.print(k + i);
			}
			System.out.println();
		}
		System.out.println(
				"///////////////////////////////////////////////////////////////////////////////////////////////////");
		for (int i = 1; i <= 100; i += 10) {
			for (int o = 0; o < 10; o++) {
				System.out.print(o + i);
			}
			System.out.println();
		}

	}
}
