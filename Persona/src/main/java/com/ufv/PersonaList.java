package com.ufv;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PersonaList {



    public List<Persona> personaList = new List<Persona>() {

        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Persona> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Persona persona) {
            return false;
        }


        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Persona> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Persona> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Persona get(int index) {
            return null;
        }

        @Override
        public Persona set(int index, Persona element) {
            return null;
        }

        @Override
        public void add(int index, Persona element) {

        }

        @Override
        public Persona remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Persona> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Persona> listIterator(int index) {
            return null;
        }

        @Override
        public List<Persona> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
}
