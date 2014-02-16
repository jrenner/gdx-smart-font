gdx-smart-font
==============

LibGDX - Generate bitmap fonts in proportion to screen size and cache them to file.

SmartFontGenerator is a class you can copy/paste into your libgdx project to smartly generated bitmap fonts.

It makes use of gdx-extension FreeTypeFontGenerator.  If you are unfamiliar with this extension, please read up on it
[here](https://github.com/libgdx/libgdx/wiki/Gdx-freetype)

#Purpose
-------

This class will solve three problems:

* Creating fonts for different screen sizes using Hiero or BMFont can be troublesome, if you have 4 fonts of different sizes
and are targeting 5-6 different screen sizes, you then must generate 20-24 bitmap font pngs.

* Generating fonts cuts down on app download size

* Generating fonts can add significant time to app startup time.  Caching the generated fonts to file, and only regenerating when needed
allows for fast app startup most of the time.
