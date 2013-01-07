package org.jingle.test.jmxremote.article.standard;

public class Standard implements StandardMBean {
	int number = 0;

	@Override
	public void setNumber(int number) {
		this.number = number;

	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public boolean guessNumber(int number) {
		return (this.number == number);
	}

}
