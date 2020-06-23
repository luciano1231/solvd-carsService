package com.solvd.carsService.linkedList;

public class Node<T> {
	private Node<T> next = null;
	private Node<T> prev = null;
	private T element = null;
	
	public Node() {

	}
	public Node<T> getNext() {
		return next;
	}

	protected void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrev() {
		return prev;
	}

	protected void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public T getElement() {
		return element;
	}

	protected void setElement(T element) {
		this.element = element;
	}

	
	public Node(T element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "element=" + element;
	}
}

