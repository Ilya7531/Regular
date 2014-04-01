package javaapplication12;

public class Word {

   public static void main(String[] args) {

		String str = "Жили дед и баба. Была у них курочка ряба. Снесла курочка яичко, не простое – золотое." + "Дед бил, бил – не разбил." + 
                "Баба била, била – не разбила." +  "Мышка бежала, хвостиком задела, яичко упало и разбилось." + "Дед плачет, баба плачет, а курочка кудахчет:" + 
                "- Не плачь, дед, не плачь, баба: снесу вам яичко не золотое – простое!";
		String start = str.substring(0, str.indexOf("."));
		String end = str.substring(str.indexOf(".") + 1);

		String[] word_first = start.replaceAll(",|:|-|\\(|\\)", "").split(" ");
		String[] words = end.replaceAll(",|:|-|\\.|\\(|\\)", "").split(" ");

		int index = 0;
		for (int i = 0; i < word_first.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (!word_first[i].equals(words[j])) {
					// System.out.print(word_first[i]+" ");
					index++;
				}
				if (index == words.length)
					System.out.print(word_first[i] + " ");
			}
			index = 0;
		}

		System.out.print(" - неповторяющиеся слова");
	}
}