class Bestelling{
KaartjesAutomaat kaartjesAutomaat;
int[] bestelling;


Bestelling(){
kaartjesAutomaat = new KaartjesAutomaat();
bestelling = new int[kaartjesAutomaat.kaartjes.length];
for (int i = 0; i < kaartjesAutomaat.kaartjes.length; i++){
 bestelling[i] = 0;
}

}

void selecteerKaartje(int kaartje) {
    if (kaartje <= kaartjesAutomaat.kaartjes.length) {
      bestelling[kaartje]++;
    }
  }

String drukKaartjesAf(){
String uitvoer = "";
  for(int i = 0; i < bestelling.length; i++){
if(bestelling[i] != 0){
for(int j = 0; j < bestelling[i]; j++){
  uitvoer += kaartjesAutomaat.drukKaartjeAf(i);
}
}
}
return uitvoer;
}

}