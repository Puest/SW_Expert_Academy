import java.util.Scanner;

class SW_1873 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			int startx = 0;
			int starty = 0;
			int dir = 0;
			int idx = 0;

			char[][] map = new char[H][W];
			for (int i = 0; i < H; i++) {
				String s = sc.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = s.charAt(j);
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						startx = i;
						starty = j;
					}
					if (map[i][j] == '^')
						dir = 1;
					else if (map[i][j] == 'v')
						dir = 2;
					else if (map[i][j] == '<')
						dir = 3;
					else if (map[i][j] == '>')
						dir = 4;
				}
			}

			int N = sc.nextInt();
			char[] joy = sc.next().toCharArray();
			for (int i = 0; i < N; i++) {
				if (joy[i] == 'U') {
					dir = 1;
					map[startx][starty] = '^';
					if (startx > 0 && map[startx - 1][starty] == '.') {
						map[startx - 1][starty] = map[startx][starty];
						map[startx][starty] = '.';
						startx -= 1;
					}
				} else if (joy[i] == 'D') {
					dir = 2;
					map[startx][starty] = 'v';
					if (startx < H - 1 && map[startx + 1][starty] == '.') {
						map[startx + 1][starty] = map[startx][starty];
						map[startx][starty] = '.';
						startx += 1;
					}
				} else if (joy[i] == 'L') {
					dir = 3;
					map[startx][starty] = '<';
					if (starty > 0 && map[startx][starty - 1] == '.') {
						map[startx][starty - 1] = map[startx][starty];
						map[startx][starty] = '.';
						starty -= 1;
					}
				} else if (joy[i] == 'R') {
					dir = 4;
					map[startx][starty] = '>';
					if (starty < W - 1 && map[startx][starty + 1] == '.') {
						map[startx][starty + 1] = map[startx][starty];
						map[startx][starty] = '.';
						starty += 1;
					}
				} else if (joy[i] == 'S') {
					if (dir == 1) {
						idx = startx;
						while (true) {
							if (idx - 1 < 0 || map[idx - 1][starty] == '#')
								break;
							if (map[idx - 1][starty] == '*') {
								map[idx - 1][starty] = '.';
								break;
							}
							idx--;
						}
					} else if (dir == 2) {
						idx = startx;
						while (true) {
							if (idx + 1 >= H || map[idx + 1][starty] == '#')
								break;
							if (map[idx + 1][starty] == '*') {
								map[idx + 1][starty] = '.';
								break;
							}
							idx++;
						}
					} else if (dir == 3) {
						idx = starty;
						while (true) {
							if (idx - 1 < 0 || map[startx][idx - 1] == '#')
								break;
							if (map[startx][idx - 1] == '*') {
								map[startx][idx - 1] = '.';
								break;
							}
							idx--;
						}
					} else if (dir == 4) {
						idx = starty;
						while (true) {
							if (idx + 1 >= W || map[startx][idx + 1] == '#')
								break;
							if (map[startx][idx + 1] == '*') {
								map[startx][idx + 1] = '.';
								break;
							}
							idx++;
						}
					}
				}
			}

			System.out.printf("#%d ", test_case);
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}