package net.adapter;

public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee japaneseAdaptee;

    public TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words ...");
        japaneseAdaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "Xin CHao!";
    }
}
