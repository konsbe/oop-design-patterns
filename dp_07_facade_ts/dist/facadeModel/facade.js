"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class FacadeModel {
    constructor(processor, ram, hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }
    start() {
        this.processor.freeze();
        this.ram.load(132, this.hd.read(3456, 89));
        this.processor.jump(132);
        this.processor.execute();
    }
}
exports.default = FacadeModel;
//# sourceMappingURL=facade.js.map