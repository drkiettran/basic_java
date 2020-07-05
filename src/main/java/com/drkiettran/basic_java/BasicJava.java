package com.drkiettran.basic_java;

public class BasicJava {
	public static void main(String[] argv) {
		light();
		area();
		chardemo();
		chardemo2();
		booltest();
		literals();
		dyninit();
		scope();
		conversion();
		array();
		autoarray();
		average();
		twodarray();
		twodarrayagain();
		matrix();
		threedmatrix();
		vardemo();
		ifelse();
		sampleswitch();
		whiledemo();
		nobodywhiledemo();
		dowhiledemo();
		fortick();
		foreach();
	}

	private static void light() {
		int lightspeed;
		long days;
		long seconds;
		long distance;

		lightspeed = 18600;
		days = 1000;
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}

	private static void area() {
		double pi, r, a;
		r = 10.8;
		pi = 3.1416;
		a = pi * r * r;
		System.out.println("Area of circle is " + a);
	}

	private static void chardemo() {
		char ch1, ch2;
		ch1 = 88;
		ch2 = 'Y';
		System.out.print("ch1 and ch2: ");
		System.out.println(ch1 + " " + ch2);
	}

	private static void chardemo2() {
		char ch1;
		ch1 = 'X';
		System.out.println("ch1 contains " + ch1);
		ch1++;
		System.out.println("ch1 is now " + ch1);
	}

	private static void booltest() {
		boolean b;
		b = false;
		System.out.println("b is " + b);
		b = true;
		System.out.println("b is " + b);

		if (b) {
			System.out.println("This is executed");
		}

		b = false;

		if (b) {
			System.out.println("This is not executed");
		}

		System.out.println("10 > 9 is " + (10 > 9));
	}

	private static void literals() {
		int x = 0b1010;
		System.out.println(x);

		int y = 123_456_789;
		System.out.println(y);

		int z = 0b1101_0101_0001_1010;
		System.out.println(z);

		double num = 9_423_497_862.0;
		System.out.println(num);

		num = 9_423_497.1_0_9;
		System.out.println(num);
	}

	private static void dyninit() {
		double a = 3.0, b = 4.0;
		double c = Math.sqrt(a * a + b * b);
		System.out.println("hypotenuse is " + c);
	}

	private static void scope() {
		int x;
		x = 10;
		if (x == 10) {
			int y = 20;
			x = y * 2;
		}
		System.out.println("x is " + x);
	}

	private static void conversion() {
		byte b;
		int i = 257;
		double d = 323.141;

		System.out.println("\nConversion of int to byte.");
		b = (byte) i;
		System.out.println("i and b " + i + " " + b);

		System.out.println("\nConversion of double to int.");
		i = (int) d;
		System.out.println("d and i " + d + " " + i);

		System.out.println("\nConversion of double to byte.");
	}

	private static void array() {
		int month_days[];
		month_days = new int[12];
		month_days[0] = 31;
		month_days[1] = 28;
		month_days[2] = 31;
		month_days[3] = 30;
		month_days[4] = 31;
		month_days[5] = 30;
		month_days[6] = 31;
		month_days[7] = 31;
		month_days[8] = 30;
		month_days[9] = 31;
		month_days[10] = 30;
		month_days[11] = 31;
		System.out.println("April has " + month_days[3] + " days");
	}

	private static void autoarray() {
		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("April has " + month_days[3] + " days");
	}

	private static void average() {
		double nums[] = { 10.1, 11.2, 1, 3, 13, 4, 14.5 };
		double result = 0;
		int i;

		for (i = 0; i < 5; i++) {
			result = result + nums[i];
		}

		System.out.println("Average is " + result / 5);
	}

	private static void twodarray() {
		int twoD[][] = new int[4][5];
		int i, j, k = 0;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}

		twoD = new int[4][];
		twoD[0] = new int[5];
		twoD[1] = new int[5];
		twoD[2] = new int[5];
		twoD[3] = new int[5];

	}

	private static void twodarrayagain() {
		int twoD[][] = new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		int i, j, k = 0;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++) {
				twoD[i][j] = k;
				k++;
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void matrix() {
		double m[][] = { { 0 * 0, 1 * 0, 2 * 0, 3 * 0 }, { 0 * 1, 1 * 1, 2 * 1, 3 * 1 }, { 0 * 2, 1 * 2, 2 * 2, 3 * 2 },
				{ 0 * 3, 1 * 3, 2 * 3, 3 * 3 } };

		int i, j;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void threedmatrix() {
		int threeD[][][] = new int[3][4][5];
		int i, j, k;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 5; k++) {
					threeD[i][j][k] = i * j * k;
				}
			}
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 5; k++) {
					System.out.print(threeD[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	private static void vardemo() {
		var avg = 10.0;
		System.out.println("Value of avg: " + avg);

		int var = 1;
		System.out.println("Value of var: " + var);

		var k = -var;
		System.out.println("value of k: " + k);
	}

	private static void ifelse() {
		int month = 4;
		String season;

		if (month == 12 || month == 1 || month == 2) {
			season = "Winter";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "Spring";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "Summer";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "Autumn";
		} else {
			season = "Bogus Month";
		}

		System.out.println("April is in the " + season + ".");
	}

	private static void sampleswitch() {
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				System.out.println("i is zero");
				break;
			case 1:
				System.out.println("i is one");
				break;
			case 2:
				System.out.println("i is two");
				break;
			case 3:
				System.out.println("i is three");
				break;
			default:
				System.out.println("i is greater than 3");
			}
		}
	}

	private static void whiledemo() {
		int n = 10;

		while (n > 0) {
			System.out.println("tick " + n);
			n--;
		}
	}

	private static void nobodywhiledemo() {
		int i, j;

		i = 100;
		j = 200;
		while (++i < --j)
			;
		System.out.println("Midpoint is " + i);
	}

	private static void dowhiledemo() {
		int n = 10;

		do {
			System.out.println("tick " + n);
			n--;
		} while (n > 0);
	}

	private static void fortick() {
		int n;
		for (n = 10; n > 0; n--) {
			System.out.println("tick " + n);
		}
	}

	private static void foreach() {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for (int x : nums) {
			sum += x;
		}
		System.out.println("Value is: " + sum);
	}
}
