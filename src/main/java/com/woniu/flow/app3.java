package com.woniu.flow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class foo{
	public int x =1;
	public int a =1;
}
class A implements Runnable{
	private foo f;
	public A(foo f) {
		super();
		this.f = f;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (f) {
				while (f.x != 1) {
					try {
						f.notifyAll();
						f.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("A");
				f.x += f.a;
				if(f.x == 0) {
					f.a=-f.a;
					f.x += f.a;
				}
			}
		}
	}
}
class B implements Runnable{
	private foo f;
	public B(foo f) {
		super();
		this.f = f;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (f) {
				while (f.x != 2) {
					try {
						f.notifyAll();
						f.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("B");
				f.x += f.a;
			}
		}
	}
}
class C implements Runnable{
	private foo f;
	public C(foo f) {
		super();
		this.f = f;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (f) {
				while (f.x != 3) {
					try {
						f.notifyAll();
						f.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("C");
				if(f.x==3) {
					f.x += f.a;
					if(f.x==4) {
						f.a=-f.a;
						f.x += f.a;
					}
				}
			}
		}
	}
}
public class app3 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		foo fo =new foo();
		
		A a = new A(fo);
		B b = new B(fo);
		C c = new C(fo);
		
		es.execute(a);
		es.execute(b);
		es.execute(c);
	}
}
