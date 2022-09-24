import CPU from "../models/cpu";
import HardDrive from "../models/hardrive";
import Memory from "../models/memory";

export default class FacadeModel {
  private processor: any;
  private ram: any;
  private hd: any;
  constructor(processor: CPU, ram: Memory, hd: HardDrive) {
    this.processor = processor;
    this.ram = ram;
    this.hd = hd;
  }
  public start(): void {
    this.processor.freeze();
    this.ram.load(132, this.hd.read(3456, 89));
    this.processor.jump(132);
    this.processor.execute();
  }
}
