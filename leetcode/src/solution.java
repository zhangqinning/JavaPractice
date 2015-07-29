import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Pair {
		int a, ai, b, bi;

		public Pair(int a, int ai, int b, int bi) {
			this.a = a;
			this.ai = ai;
			this.b = b;
			this.bi = bi;
		}

		boolean same(Pair p) {
			return p != null && p.a == a && p.b == b;
		}
	}

	public List<List<Integer>> fourSum(int[] num, int target) {
		List<List<Integer>> res = new ArrayList<>();
		if (num.length < 4) {
			return res;
		}
		Arrays.sort(num);
		TreeMap<Integer, List<Pair>> map = new TreeMap<>();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				Pair pair = new Pair(num[i], i, num[j], j);
				int sum = num[i] + num[j];
				List<Pair> list;
				if (map.containsKey(sum))
					list = map.get(sum);
				else {
					list = new ArrayList<>();
					map.put(sum, list);
				}
				list.add(pair);
			}
		}
		Integer first = map.firstKey();
		Integer last = map.lastKey();
		while (first != null && last != null && first <= last) {
			if (first + last > target) {
				last = map.lowerKey(last);
			} else if (first + last < target) {
				first = map.higherKey(first);
			} else if (first == last) {
				List<Pair> list = map.get(first);
				for (int i = 0; i < list.size(); i++) {
					Pair a = list.get(i);
					if (a.a == a.b) {
						for (int j = i + 1; j < list.size(); j++) {
							Pair b = list.get(j);
							if (b.a == b.b) {
								if (a.bi < b.ai) {
									res.add(Arrays.asList(new Integer[] { a.a,
											a.b, b.a, b.b }));
									break;
								}
							} else {
								break;
							}
						}
					}
					break;
				}

				last = map.lowerKey(last);
				first = map.higherKey(first);
			} else {
				Pair lastA = null;
				for (Pair a : map.get(first)) {
					if (a.same(lastA))
						continue;
					lastA = a;
					Pair lastB = null;
					for (Pair b : map.get(last)) {
						if (a.bi < b.ai) {
							if (b.same(lastB)) {
								continue;
							}
							lastB = b;
							res.add(Arrays.asList(new Integer[] { a.a, a.b,
									b.a, b.b }));
						}
					}
				}
				last = map.lowerKey(last);
				first = map.higherKey(first);

			}
		}
		return res;

	}
}
