/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author Suri
 */
public class NodoLista<E> {
	private E item;
	private NodoLista<E> sig;
	
	public NodoLista(E item) {
		this.setItem(item);
		this.setSig(null);
	}

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

	public NodoLista<E> getSig() {
		return sig;
	}

	public void setSig(NodoLista<E> sig) {
		this.sig = sig;
	}
	
}