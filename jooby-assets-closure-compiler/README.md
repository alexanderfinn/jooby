# closure-compiler

<a href="https://developers.google.com/closure/compiler">Closure Compiler</a> is a tool for making JavaScript download and run faster.

Make sure you already setup the [assets module](https://github.com/jooby-project/jooby/tree/master/jooby-assets) in your project!

## dependency

```xml
<dependency>
  <groupId>org.jooby</groupId>
  <artifactId>jooby-assets-closure-compiler</artifactId>
  <version>0.13.0</version>
  <scope>test</scope>
</dependency>
```

## usage

```
assets {
 fileset {
   home: ...
 }
 pipeline {
   ...
   dist: [closure-compiler]
 }
}
```

## options

```
assets {
 ...
 closure-compiler {
   level: advanced
 }
}
```

# see also

## css processors

* [props](https://github.com/jooby-project/jooby/tree/master/jooby-assets-props): replace application properties in CSS files.

* [csslint](https://github.com/jooby-project/jooby/tree/master/jooby-assets-csslint): check and validate css rules.

* [sass](https://github.com/jooby-project/jooby/tree/master/jooby-assets-sass): Sass support from <a href="https://github.com/sass/sass">Sass (ruby)</a>.

* [less4j](https://github.com/jooby-project/jooby/tree/master/jooby-assets-less4j): Less support from [less4j](https://github.com/SomMeri/less4j)

* [less](https://github.com/jooby-project/jooby/tree/master/jooby-assets-less): Less support from [less.js](http://lesscss.org)

* [clean-css](https://github.com/jooby-project/jooby/tree/master/jooby-assets-clean-css): minify css.

* [yui-css](https://github.com/jooby-project/jooby/tree/master/jooby-assets-yui-compressor): YUI CSS optimizer.

## js processors

* [props](https://github.com/jooby-project/jooby/tree/master/jooby-assets-props): replace application properties in JavaScript files.

* [jscs](https://github.com/jooby-project/jooby/tree/master/jooby-assets-jscs): JavaScript code style checker.

* [jshint](https://github.com/jooby-project/jooby/tree/master/jooby-assets-jshint): JavaScript linter, helps to detect errors and potential problems in code..

* [babel](https://github.com/jooby-project/jooby/tree/master/jooby-assets-babel): Ecma6 now via <a href="http://babeljs.io/">Babel</a>.

* [rollup](https://github.com/jooby-project/jooby/tree/master/jooby-assets-rollup): <a href="http://rollupjs.org/">rollup.js</a> the next-generation ES6 module bundler..

* [ng-annotate](https://github.com/jooby-project/jooby/tree/master/jooby-assets-ng-annotate): Add, remove and rebuild AngularJS dependency injection annotations.

* [closure-compiler](https://github.com/jooby-project/jooby/tree/master/jooby-assets-closure-compiler): Google JavaScript optimizer and minifier.

* [uglify](https://github.com/jooby-project/jooby/tree/master/jooby-assets-uglify): uglify.js optimizer.

* [requirejs](https://github.com/jooby-project/jooby/tree/master/jooby-assets-requirejs): r.js optimizer.

* [yui-js](https://github.com/jooby-project/jooby/tree/master/jooby-assets-yui-compressor): YUI JS optimizer.
