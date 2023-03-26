
public class WordCount {
	
	private int count = 0;
	
	public WordCount(String sentence) {
		sentenceToWord(sentence);
	}

	public void setCounterZero() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}
	
	public void display() {
		System.out.println("Count: " + count);
	}
	
	private void increase() {
		count++;
	}
	
	private void decrease() {
		if(count > 0) {
			count--;
		}
	}
	
	private void sentenceToWord(String sentence) {
		String[] words = sentence.split(" ");
		for(String word: words) {
			char c = word.charAt(0);
			if(c == 'A' || c == 'a') {
				decrease();
			} else {
				increase();
			}
		}
	}
}
