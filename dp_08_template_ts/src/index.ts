import ModelOne from "./models/modelone";
import ModelTwo from "./models/modeltwo";
import Template from "./template";

console.log("Starting!");

export default class Main {
  public static init(): void {
    var template: Template = new ModelOne("modelone");
    template.play();
    console.log("================================================");
    template = new ModelTwo();
    template.play();
  }
}

Main.init();
