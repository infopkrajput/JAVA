/*
    Time Complexity = O(N*logN*logN)
    Space Complexity = O(N*logN)

    Where N is the number of coordinates.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {

	private static long dist(point p1, point p2) {
		// find distance between points p1 and p2
		long dis = (long) ((long) p1.x - p2.x) * (p1.x - p2.x) + (long) ((long) p1.y - p2.y) * (p1.y - p2.y);
		return dis;
	}

	private static long findMinDist(point pts[], int n) {

		// find minimum distance between two points in a set
		long min = Long.MAX_VALUE;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (dist(pts[i], pts[j]) < min) {
					min = dist(pts[i], pts[j]);
				}
			}
		}

		return min;
	}

	private static long stripClose(ArrayList<point> strip, long d) {

		// sort the strip array with respect to y coordinates.
		Collections.sort(strip, new Comparator<point>() {
			public int compare(point p1, point p2) {
				if (p1.y <= p2.y) {
					return -1;
				}
				return 1;
			}
		});

		// find closest distance of two points in a strip
		long min = d;
		for (int i = 0; i < strip.size(); ++i) {
			for (int j = i + 1; j < strip.size() && (strip.get(j).y - strip.get(i).y) < min; ++j) {
				if (dist(strip.get(i), strip.get(j)) < min) {
					min = dist(strip.get(i), strip.get(j));
				}
			}
		}

		return min;
	}

	private static long findClosest(point xSorted[], int n) {

		if (n <= 3) {
			return findMinDist(xSorted, n);
		}

		int mid = n / 2;

		point midPoint = xSorted[mid];

		int leftIndex = 0, rightIndex = 0;

		// x sorted points in the left side
		point xSortedLeft[] = new point[mid + 1];

		// x sorted points in the right side
		point xSortedRight[] = new point[n - mid - 1];

		for (int i = 0; i < n; i++) {
			if (i < xSortedLeft.length) {
				xSortedLeft[leftIndex++] = xSorted[i];
			} else {
				xSortedRight[rightIndex++] = xSorted[i];
			}
		}

		// get minimum distance of left and right part.
		long leftDist = findClosest(xSortedLeft, mid + 1);
		long rightDist = findClosest(xSortedRight, n - mid - 1);

		long dist = Math.min(leftDist, rightDist);

		// hold points closer to the vertical line
		ArrayList<point> strip = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (Math.abs(xSorted[i].x - midPoint.x) < dist) {
				strip.add(xSorted[i]);
			}
		}

		// find minimum using distance and closest pair in strip
		return Math.min(dist, stripClose(strip, dist));
	}

	public static long closestPair(point coordinates[], int n) {

		// find distance of closest pair in a set of points
		point[] xSorted = new point[n];

		for (int i = 0; i < n; i++) {
			xSorted[i] = coordinates[i];
		}

		// sort coordinates with respect to x values.
		Arrays.sort(xSorted, new Comparator<point>() {
			public int compare(point p1, point p2) {
				if (p1.x <= p2.x) {
					return -1;
				}
				return 1;
			}
		});

		return findClosest(xSorted, n);
	}

}