class Dobbelsteen {
  int aantalZijden;

Dobbelsteen(){
aantalZijden = 6;
}

  Dobbelsteen(int aantalZijden) {
    this.aantalZijden = aantalZijden;
  }

int dobbel(){
return (int) random(1, aantalZijden);

}
}