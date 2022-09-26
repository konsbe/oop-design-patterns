export default interface ITemplate {
  loadAssets(): void;
  initialize(): void;
  startPlay(): void;
  endPlay(): void;
  play(): void;
}
