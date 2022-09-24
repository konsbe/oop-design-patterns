"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const cpu_1 = __importDefault(require("./models/cpu"));
const hardrive_1 = __importDefault(require("./models/hardrive"));
const memory_1 = __importDefault(require("./models/memory"));
const facade_1 = __importDefault(require("./facadeModel/facade"));
class Main {
    static main(args) {
        var cpu = new cpu_1.default();
        var memory = new memory_1.default();
        var hd = new hardrive_1.default();
        console.log("args: ", args);
        var facadeModel = new facade_1.default(cpu, memory, hd);
        facadeModel.start();
    }
}
exports.default = Main;
Main.main("Started");
//# sourceMappingURL=index.js.map