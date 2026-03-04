public class CountFlips {
  public static void main(String[] args) {
    Coin coin = new Coin();


    int heads = 0;
    int tails = 0;

    for (int i = 0; i < 100; i++){
      coin.flip();
      if (coin.isHeads()){
        System.out.println("Heads");
        heads++;
      }else {
        System.out.println("Tails");
        tails++;
      }
    }
    System.out.println("Coin landed heads " + heads + " times");
    System.out.println("the coin landed tails " + tails + " times");
  }
}
