import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
// import './index.css'
// import App from './App.jsx'
// import Greet from './Greet.jsx'
// import Counter from './counter.jsx'
// import Products from './Products.jsx'
// import Timer from './Timer.jsx'
import Theme from './Theme.jsx'
import { ThemeProvider } from './Context/ThemeContext.jsx'
createRoot(document.getElementById('root')).render(
  <StrictMode>
    <ThemeProvider>
      <Theme />
    </ThemeProvider>
  </StrictMode>,
)
