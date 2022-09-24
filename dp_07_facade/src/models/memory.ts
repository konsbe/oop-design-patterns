export default class Memory {
  public load(position: number, data: Array<any>): void {
    console.log("Added item to memory: " + position, data);
  }
}
