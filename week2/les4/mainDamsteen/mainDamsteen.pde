



int grootte = 50;


//MOOIER
Damsteen[] stenen = new Damsteen[]{ new Damsteen(100, 50, grootte, #ffffff), 
  new Damsteen(200, 200, grootte, #ffffff), 
  new Damsteen(300, 300, grootte, #000000), 
  new Damsteen(300, 400, grootte, #000000)
};

void setup() {
  size(500, 500);
  smooth(10);
}


void draw() {
  background(200);
  for (int i=0; i<stenen.length; i++) {
    stenen[i].tekenSteen();
  }

}

void mouseClicked() {
  for (int i=0; i<stenen.length; i++) {
    stenen[i].isGeselecteerd();
  }
println(stenen);
}