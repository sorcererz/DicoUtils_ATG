package fr.wcs.atg.dicoutils;

public class DicoSearch {

	public String byEquals(String[] arrayARG, String StringARG) {
		boolean result = false;
		for (int i = 0; i < arrayARG.length; i++) {
			boolean answer = arrayARG[i].equals(StringARG);
			if (answer) {
				result = true;
				break;
			}
		}
		return result ? "Trouvé" : "Pas trouvé !";
	}

	public String byContains(String[] arrayARG, String StringARG) {
		StringBuilder sb = new StringBuilder();
		boolean result = false;
		for (int i = 0; i < arrayARG.length; i++) {
			if (arrayARG[i].contains(StringARG)) {
				result = true;
	            sb.append(arrayARG[i]);
	            sb.append('\r');
			}
		}
		return result ? sb.toString() : "Pas trouvé !";
	}
	
	public String byStartsWith(String[] arrayARG, String StringARG) {
		StringBuilder sb = new StringBuilder();
		boolean result = false;
		for (int i = 0; i < arrayARG.length; i++) {
			if (arrayARG[i].startsWith(StringARG)) {
				result = true;
	            sb.append(arrayARG[i]);
	            sb.append('\r');
			}
		}
		return result ? sb.toString() : "Pas trouvé !";
	}

	public String byEndsWith(String[] arrayARG, String StringARG) {
		StringBuilder sb = new StringBuilder();
		boolean result = false;
		for (int i = 0; i < arrayARG.length; i++) {
			if (arrayARG[i].endsWith(StringARG)) {
				result = true;
	            sb.append(arrayARG[i]);
	            sb.append('\r');
			}
		}
		return result ? sb.toString() : "Pas trouvé !";
	}
	
	public String byRegex(String[] arrayARG, String StringARG) {
		StringBuilder sb = new StringBuilder();
		boolean result = false;
		for (int i = 0; i < arrayARG.length; i++) {
			if (arrayARG[i].matches(StringARG)) {
				result = true;
	            sb.append(arrayARG[i]);
	            sb.append('\r');
			}
		}
		return result ? sb.toString() : "Pas trouvé !";
	}
}
