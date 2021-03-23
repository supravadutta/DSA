class Transport {
  String state;
  int men;
  int women;
  int children;

  Transport(String state, int men, int women, int children) {
    this.state = state;
    this.men = men;
    this.women = women;
    this.children = children;
  }
}

class Main {
  public static void main(String[] args) {
    Transport[] train = new Transport[2];
    train[0] = new Transport("Bihar", 23500, 17237, 5927);
    train[1] = new Transport("Orissa", 22658, 24555, 2364);

    Transport[] bus = new Transport[2];
    bus[0] = new Transport("UP", 36517, 22617, 6314);
    bus[1] = new Transport("Jharkhand", 23254, 19845, 1336);

    System.out.println("By Train");
    System.out.println("---------");
    System.out.println("Destination state" + "  Men  " + "  Women  " + "  Children  ");
    System.out.println("------------------------------------------------------------");
    for (Transport el : train) {
      System.out.println(el.state + "            " + el.men + "     " + el.women + "      " + el.children);
    }
    System.out.println();

    System.out.println("By Bus");
    System.out.println("---------");
    System.out.println("Destination state" + "   Men  " + "  Women  " + "  Children  ");
    System.out.println("------------------------------------------------------------");
    for (Transport el : bus) {
      System.out.println(el.state + "                 " + el.men + "     " + el.women + "      " + el.children);
    }
  }
}