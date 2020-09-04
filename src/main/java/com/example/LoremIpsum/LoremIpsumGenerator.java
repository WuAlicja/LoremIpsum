package com.example.LoremIpsum;

import de.svenjacobs.loremipsum.LoremIpsum;

public class LoremIpsumGenerator {

public String getLoremIpsum(int numberOfWords) {
  LoremIpsum loremIpsum = new LoremIpsum();
  return loremIpsum.getWords(numberOfWords);
}
  public String getLoremIpsumParagraph(int numberOfParagraphs){
    LoremIpsum loremIpsum = new LoremIpsum();
    return loremIpsum.getParagraphs(numberOfParagraphs);
  }


  public static void main(String[] args) {

  int myNumberOfWords=20;
  LoremIpsumGenerator loremIpsumGenerator=new LoremIpsumGenerator();
    System.out.println(loremIpsumGenerator.getLoremIpsum(myNumberOfWords));

    System.out.println(loremIpsumGenerator.getLoremIpsumParagraph(3));
  }
}
