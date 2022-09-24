# Making an empty node directory

`npm -v`<br />
`npm init -y`<br />

## Adding typescript

`npm install -D @types/node typescript`<br />
`npx tsconfig.json`<br />
`npm install -D ts-node`<br />
`npm install -D nodemon`<br />

### running and compiling

```
"scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "watch": "tsc -w",
    "start": "ts-node src/index.ts",
    "complete": "node dist/index.js",
    "dev": "nodemon dist/index.js",
    "dev2": "nodemon --exec ts-node src/index.ts"
  },
```

`npm start` running src file <br/>
`npm run watch` compiling src/index.ts -> dist/index.js and waiting for changes recompile <br/>
`npm run complete` running dist with node <br/>
`npm run dev` waiting changes and rerun index.js <br/>

#### how to run it!

`npm run watch` on one terminal and<br/>
`npm run dev` on another
