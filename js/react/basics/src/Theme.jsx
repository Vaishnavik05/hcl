import { useState, useTheme } from "react"
import Header from "./Components/Header"
import Footer from "./Components/Footer"
import ThemeContext, { ThemeProvider } from "./Context/ThemeContext"

export default function Theme() {
  const { theme, setTheme } = useTheme();
  return <>
    <ThemeProvider>
      <Header />
      <Footer />
      <button onClick={() => {
        setTheme(theme === 'light' ? 'dark' : 'light')
      }}>Toggle Theme</button>
    </ThemeProvider>
  </>
}
