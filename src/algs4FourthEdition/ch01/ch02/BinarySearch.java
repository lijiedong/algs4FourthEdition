package algs4FourthEdition.ch01.ch02;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {

	// return the index of the key in the sorted array a[]; -1 if not found

	public static int search(String key, String[] a) {

	return search(key, a, 0, a.length);

	}

	public static int search(String key, String[] a, int lo, int hi) {

	// possible key indices in [lo, hi)

	if (hi <= lo) return -1;

	int mid = lo + (hi - lo) / 2;

	int cmp = a[mid].compareTo(key);

	if (cmp > 0) return search(key, a, lo, mid);

	else if (cmp < 0) return search(key, a, mid+1, hi);

	else return mid;

	}

	// whitelist, exception filter

	public static void main(String[] args) {

	In in = new In(args[0]);

	String s = in.readAll();

	String[] words = s.split("\\s+");

	System.err.println("Done reading words");

	// sort the words (if needed)

	Arrays.sort(words);

	System.err.println("Done sorting words");

	// prompt user to enter a word and check if it's there

	while (!StdIn.isEmpty()) {

	String key = StdIn.readString();

	if (search(key, words) < 0) StdOut.println(key);

	}

	}

	}
