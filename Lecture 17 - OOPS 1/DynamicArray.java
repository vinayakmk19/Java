package com.abc;

import java.lang.annotation.Retention;

public class DynamicArray {

	private int data[];
	private int nextElementIndex;

	public DynamicArray() {
		data = new int[5];
		nextElementIndex = 0;
	}

	public int size() {
		return nextElementIndex;
	}

	public boolean isEmpty() {
		return nextElementIndex == 0;
	}

	public int get(int i) {
		if (i >= nextElementIndex) {
			return -1;
		}
		return data[i];
	}

	public void add(int element) {
		if (nextElementIndex == data.length) {
			doubleCapacity();
		}

		data[nextElementIndex] = element;
		nextElementIndex++;
	}

	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];

		for (int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public void set(int i, int ele) {
		if (i >= nextElementIndex) {
			return;
		}

		data[i] = ele;
	}

	public int removeLast() {
		if (nextElementIndex == 0) {
			return -1;
		}

		int temp = data[nextElementIndex - 1];
		data[nextElementIndex - 1] = 0;
		nextElementIndex--;
		return temp;
	}

	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		d.add(1);
		d.get(0);
		System.out.println(d.get(0));

	}

}
