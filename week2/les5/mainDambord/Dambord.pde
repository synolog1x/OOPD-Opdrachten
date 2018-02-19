class Dambord {
  Damsteen[] stenen;

  Dambord(int steenGrootte) {
    stenen = new Damsteen[]{  
      new Damsteen(100, 50, steenGrootte, #ffffff), 
      new Damsteen(200, 200, steenGrootte, #ffffff), 
      new Damsteen(300, 300, steenGrootte, #000000), 
      new Damsteen(300, 400, steenGrootte, #000000)
    };
  }

  void tekenDamstenen() {
    for (int i=0; i<stenen.length; i++) {
      stenen[i].tekenSteen();
    }
  }

  void selecteerDamsteen() {
    for (int i=0; i<stenen.length; i++) {
      stenen[i].isGeselecteerd();
    }
    println(stenen);
  }
}