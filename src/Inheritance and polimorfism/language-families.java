class Language {
  protected String name;
  protected Integer numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  public Language(String name, Integer numSpeakers, String regionsSpoken, String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
    System.out.println("The language follows the word order: " + wordOrder);
  }

  public static void main(String[] args) {
    Language portuguese = new Language("Portuguese", 260_000_000, "Brazil", "subject-verb-object");
      portuguese.getInfo();
    
    Mayan chontal = new Mayan("chontal", 60_536);
      chontal.getInfo();

    SinoTibetan mandarinChinese = new SinoTibetan("mandarinchinese",60000);
      mandarinChinese.getInfo();

    SinoTibetan burmese = new SinoTibetan("burmese",10000);
      burmese.getInfo();
    
  }
}