package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		CharStackImpl csLeft = new CharStackImpl();
		CharStackImpl csRight = new CharStackImpl();
		char[] cArray = s.replaceAll(" ", "").toLowerCase().toCharArray();
		boolean r = true, ungleich = false;

		if(cArray.length == 1) return r;

		int anzahlMitte;
		if(cArray.length % 2 == 0){
			anzahlMitte = cArray.length / 2;
		} else {
			anzahlMitte = (int) cArray.length / 2;
			ungleich = true;
		}

		for(int i = 0; i < anzahlMitte; i++) {
			csLeft.push(cArray[i]);
		}
		if(ungleich == true) anzahlMitte++;
		for(int i = cArray.length - 1; i >= anzahlMitte; i--) {
			csRight.push(cArray[i]);
		}

		for(int i = 0; i < csLeft.size(); i++) {
			if(csLeft.pop() != csRight.pop()) r = false;
		}

		return r;
	}
}
