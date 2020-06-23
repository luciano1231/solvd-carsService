package com.solvd.carsService.linkedList;

import java.util.ListIterator;
import java.util.Objects;

public class GenericIterator<T> implements ListIterator<T> {
	private Node<T> nextdNode;
	private Node<T> previousNode;

	public Node<T> getnextdNode() {
		return nextdNode;
	}

	private void setnextdNode(Node<T> nextdNode) {
		this.nextdNode = nextdNode;
	}

	public Node<T> getPreviousNode() {
		return previousNode;
	}

	private void setpreviousNode(Node<T> previousNode) {
		this.previousNode = previousNode;
	}

	public GenericIterator() {
	}

	public GenericIterator(Node<T> head, Node<T> tail) {
		this.nextdNode = head;
		this.previousNode = tail;
	}

	@Override
	public boolean hasNext() {
		return Objects.nonNull(getnextdNode());
	}

	@Override
	public T next() {
		Node<T> aux = getnextdNode();
		setnextdNode(getnextdNode().getNext());
		return aux.getElement();
	}

	@Override
	public boolean hasPrevious() {
		return Objects.nonNull(getPreviousNode());
	}

	@Override
	public T previous() {
		Node<T> aux = getPreviousNode();
		setpreviousNode(getPreviousNode().getPrev());
		return aux.getElement();
	}

	@Override
	public int nextIndex() {
		return 0;
	}

	@Override
	public int previousIndex() {
		return 0;
	}

	@Override
	public void remove() {
	}

	@Override
	public void set(T t) {
	}

	@Override
	public void add(T t) {
	}
}