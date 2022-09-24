import CPU from "./models/cpu";
import HardDrive from "./models/hardrive";
import Memory from "./models/memory";
import FacadeModel from "./facadeModel/facade";

export default class Main {
  public static main(args: any): void {
    var cpu: CPU = new CPU();
    var memory: Memory = new Memory();
    var hd: HardDrive = new HardDrive();
    console.log("args: ", args);
    var facadeModel: FacadeModel = new FacadeModel(cpu, memory, hd);
    facadeModel.start();
  }
}
// var main = new Main();
Main.main("Started");
// console.log("hell yeah Mother!");
