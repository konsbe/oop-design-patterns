import Template from "../template";
// import * as readline from "readline";

// var rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

export default class ModelTwo extends Template {
  answer: boolean;
  protected addNewSubModelNow(): void {
    console.log("adding new sub model two now!");
  }
  public subModelWants(): boolean {
    this.answer = this.getUserInput();
    // return this.getUserInput() ? true : false;
    return true;
  }
  initialize(): void {
    console.log("ModelOne initializing...");
  }
  startPlay(): void {
    console.log("ModelOne starting...");
    this.subModelWants();
  }
  endPlay(): void {
    console.log("ModelOne ending...");
  }

  private getUserInput = (): boolean => {
    this.answer = true;
    // rl.question("Is this example useful? [y/n] ", (string: string) => {
    // this.answer = string.toLowerCase() === "y" ? true : false;
    // close input stream
    // rl.close();
    return this.answer;
  };
}
