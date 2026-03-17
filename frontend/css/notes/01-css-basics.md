# CSS Basics

## Overview
CSS (Cascading Style Sheets) describes how HTML elements should be displayed. It controls layout, colors, typography, spacing, and responsive behavior.

## Ways to Add CSS
- **Inline**: `style="..."` on an element (highest priority, hard to maintain).
- **Internal**: `<style>` block inside `<head>` (useful for a single page).
- **External**: Separate `.css` file linked with `<link rel="stylesheet" href="...">` (best for reuse across pages).

## Selectors
CSS selectors target elements to apply styles.
- Element selector: `div`, `p`
- Class selector: `.card`
- ID selector: `#main`
- Child selector: `ul > li`

## Specificity and Cascade
- Styles are applied based on specificity (ID > class > element).
- Later rules override earlier ones if they have equal specificity.

## Example snippet
```css
.button {
  background-color: green;
  color: white;
  padding: 10px;
}
```

## Example files
- [code/01inline.html](../code/01inline.html) (inline styles)
- [code/02internal.html](../code/02internal.html) (internal `<style>` block)
- [code/03external.html](../code/03external.html) (external stylesheet)
- [code/style.css](../code/style.css) (example stylesheet)
