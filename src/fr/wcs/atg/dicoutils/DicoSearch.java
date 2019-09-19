package fr.wcs.atg.dicoutils;

public class DicoSearch {

	public String byEquals(String[] arrayARG, String StringARG) {
		for (int i = 0; i < arrayARG.length; i++) {
			boolean answer = arrayARG[i].equals(StringARG);
			if (answer = true) {
				return "Trouvé !";
			} else {
				return "Pas trouvé !";
			}
		}
		return "Erreur";
	}

	public String byContains(String[] arrayARG, String StringARG) {
		for (int i = 0; i < arrayARG.length; i++) {
			boolean answer = arrayARG[i].contains(StringARG);
			if (answer = true) {
				return "Trouvé !";
			} else {
				return "Pas trouvé !";
			}
		}
		return "Erreur";
	}

	public String byStartsWith(String[] arrayARG, String StringARG) {
		for (int i = 0; i < arrayARG.length; i++) {
			boolean answer = arrayARG[i].startsWith(StringARG);
			if (answer = true) {
				return "Trouvé !";
			} else {
				return "Pas trouvé !";
			}
		}
		return "Erreur";
	}

	public String byEndsWith(String[] arrayARG, String StringARG) {
		for (int i = 0; i < arrayARG.length; i++) {
			boolean answer = arrayARG[i].endsWith(StringARG);
			if (answer = true) {
				return "Trouvé !";
			} else {
				return "Pas trouvé !";
			}
		}
		return "Erreur";
	}

	public String byRegex(String[] arrayARG, String StringARG) {
		for (int i = 0; i < arrayARG.length; i++) {
			boolean answer = arrayARG[i].matches(StringARG);
			if (answer = true) {
				return "Trouvé !";
			} else {
				return "Pas trouvé !";
			}
		}
		return "Erreur";
	}
}
