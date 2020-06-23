package com.solvd.carsService.linkedList;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class LinkedList<T> implements Iterable<T> {
	private Node<T> head;
	private Node<T> tail;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}

	public LinkedList() {
		head = new Node<T>();
		tail = head;
	}

	public LinkedList(Node<T> node) {
		this.head = node;
		this.tail = node;
	}

	public T get(int idx) {
		int cont = 0;
		for (T t : this) {
			if (cont == idx) {
				return t;
			}
			cont++;
		}
		return null;
	}
	public LinkedList<T> reverse() {
		LinkedList<T> reverse = new LinkedList<T>();
		ListIterator<T> itr = iterator();
		while (itr.hasPrevious()) {
			reverse.add(itr.previous());
		}
		return reverse;
	}

	public void remove(T elementToRemove) {
		Node<T> aux = head;
		while (aux.getNext() != null) {
			if (elementToRemove.equals(aux.getElement())) {
				aux.getPrev().setNext(aux.getNext());
				aux.getNext().setPrev(aux.getPrev());
			}
			aux = aux.getNext();
		}
	}

	public void add(T element) {
		Node<T> node = new Node<>(element);
		if (Objects.isNull(head.getElement())) {
			head = node;
			tail = head;
		} else {
			tail.setNext(node);
			node.setPrev(tail);
			tail = node;
		}
	}

	public void add(int idx, T element) {
		Node<T> aux = head;
		int count = 0;
		while (Objects.nonNull(aux)) {
			if (count == idx) {
				Node<T> n = new Node<>(element);
				aux.getPrev().setNext(n);
				n.setNext(aux);
				n.setPrev(aux.getPrev());
				aux.setPrev(n);
				break;
			}
			aux = aux.getNext();
			count++;
		}
	}

	@Override
	public ListIterator<T> iterator() {
		return new GenericIterator<T>(head, tail);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		Iterator<T> itr = iterator();
		while (itr.hasNext()) {
			result.append(itr.next().toString());
			if (itr.hasNext()) result.append(",");
		}
		return result.append("]").toString();
	}
}