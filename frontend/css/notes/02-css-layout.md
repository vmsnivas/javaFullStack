# CSS Layout & Positioning

## Overview
This note explores how CSS controls layout using the box model, display modes, floating, and modern layout systems like Flexbox.

## Box Model
Every element is a rectangular box comprising:
- `content`: the element's content.
- `padding`: space between content and border.
- `border`: the outline around the element.
- `margin`: space outside the border.

## Display Types
- `display: block`: element takes full width and starts on a new line.
- `display: inline`: element flows inline with text.
- `display: inline-block`: inline but can have width/height.
- `display: none`: element is removed from layout.

## Positioning
- `static` (default)
- `relative` (position relative to normal location)
- `absolute` (position relative to nearest positioned ancestor)
- `fixed` (position relative to viewport)

## Float (Legacy Layout)
Floating elements (`float: left/right`) allow other content to wrap around them. Common for text-wrapping and image placement.

## Flexbox (Modern Layout)
`display: flex` creates a flex container for flexible row/column layouts.
- `justify-content`: horizontal alignment
- `align-items`: vertical alignment

## Backgrounds
- `background-color`: solid color.
- `background-image`: images as backgrounds.

## Example files
- `code/box.html` + `code/box.css` (box model examples)
- `code/float.html` + `code/float.css` (float layout)
- `code/c1_567-flex.html` + `code/flex.css` (flexbox layout)
- `code/c18-bgVideo.html` (background video example)
