import Template from "../template";

export default class ModelOne extends Template {
  name: string;
  constructor(n: string) {
    super();
    this.name = n;
  }
  protected addNewSubModelNow(): void {
    console.log("making sub model 1 now! ");
  }
  initialize(): void {
    console.log("ModelOne initializing...");
  }
  startPlay(): void {
    console.log("ModelOne starting...");
  }

  endPlay(): void {
    console.log("ModelOne ending...");
  }
}
