# HTML (Intro)

## Overview
HTML (HyperText Markup Language) defines the structure and content of a webpage. It uses tags to represent elements such as headings, paragraphs, images, and links.

## Core Structure
Every HTML document has a basic structure:

```html
<!doctype html>
<html>
  <head>
    <title>Page Title</title>
  </head>
  <body>
    <!-- Page content -->
  </body>
</html>
```

### Important Elements
- `<html>`: The root element.
- `<head>`: Meta information (title, links to CSS/JS, metadata).
- `<body>`: Content shown to the user.
- `<title>`: Displayed in the browser tab.

## Text Content
- Headers: `<h1>` to `<h6>`
- Paragraph: `<p>`
- Bold: `<strong>` / `<b>`
- Italic: `<em>` / `<i>`

## Lists
- Unordered list:
  ```html
  <ul>
    <li>Item 1</li>
    <li>Item 2</li>
  </ul>
  ```
- Ordered list:
  ```html
  <ol>
    <li>Item 1</li>
    <li>Item 2</li>
  </ol>
  ```
- Description list:
  ```html
  <dl>
    <dt>Term</dt>
    <dd>Description</dd>
  </dl>
  ```

## Tables
```html
<table>
  <thead>
    <tr>
      <th>Header</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Cell</td>
    </tr>
  </tbody>
</table>
```

## Attributes
Attributes add extra information to elements.
Example:
```html
<img src="logo.jpg" alt="Logo" width="100">
```

## Inline Styling
Inline styles can be used for quick experimentation but are not recommended for production.
```html
<button style="width: 150px; background-color: green; color: white;">Click</button>
```

## Semantic Elements
These elements help describe the purpose of the content:
- `<header>`, `<nav>`, `<main>`, `<section>`, `<article>`, `<aside>`, `<footer>`
- `<figure>` + `<figcaption>` for media with captions
- `<details>` + `<summary>` for collapsible sections

## Images & Media
- `<img src="..." alt="...">` (always include `alt` for accessibility).
- Multimedia: `<audio>`, `<video>`.

---

### Notes
- Use semantic tags to improve accessibility and SEO.
- Keep the HTML structure logical and well-indented.
