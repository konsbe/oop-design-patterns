// import ITemplate from "./ITemplate";

export default abstract class Template {
  abstract initialize(): void;
  abstract startPlay(): void;
  abstract endPlay(): void;

  //Template method
  public play(): void {
    this.loadAssets();
    this.initialize();
    this.startPlay();
    if (this.addNewSubModel()) {
      this.addNewSubModelNow();
    }
    this.endPlay();
  }
  public loadAssets(): void {
    console.log("Loading assets...");
  }

  //hooked-in
  protected abstract addNewSubModelNow(): void;

  public addNewSubModel(): boolean {
    return true;
  }
}
