String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
  println(plakCodeVoorId(idLijst[0], "NL"));
  println(plakCodeVoorIdLijst(idLijst, "NL"));
  //ONDERDEEL A
  println("test: NL8b3 NL4bf NL9h0");
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}

//ONDERDEEL B
String[] plakCodeVoorIdLijst(String[] id, String code) {
  String[] resultaat = new String[id.length];
  for (int i = 0; i < id.length; i++) { //<>//
  resultaat[i] = code + id[i];
  }

  return resultaat;
}