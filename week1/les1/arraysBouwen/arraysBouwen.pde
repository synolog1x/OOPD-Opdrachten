void setup(){
  size(10,10);
int[] arrayA = {4,2,10,8,9};
int[] arrayB = {3,9,13,1,3,4,5,25};
println(telElementenOp(arrayA, arrayB));
println(maakMaxArray(arrayA, arrayB));

}

//OPGAVE A
int[] telElementenOp(int[] arrayA, int[] arrayB) {
  int [][] tijdelijk = {arrayA, arrayB};
  int[] uitvoer = new int[tijdelijk.length];
  for (int j = 0; j <tijdelijk.length; j++) {
    int opgeteld = 0;
    for (int i = 0; i < tijdelijk[j].length; i++) {
      opgeteld += tijdelijk[j][i];
    }
    uitvoer[j] = opgeteld;
  }
  return uitvoer;
}

//OPGAVE B
int[] maakMaxArray(int[] arrayA, int[] arrayB) {
  int[][] tijdelijk = {arrayA, arrayB};
  int[] uitvoer = new int[tijdelijk.length];
  for (int j = 0; j <tijdelijk.length; j++) {
    int hoogsteGetal = tijdelijk[j][0];
    for (int i = 0; i < tijdelijk[j].length; i++) {
      if (tijdelijk[j][i] > hoogsteGetal) {
      hoogsteGetal = tijdelijk[j][i];
      
      }
    }
    uitvoer[j] = hoogsteGetal;
  }

  return uitvoer;
}