import { createContext }   from "react";
let ThemeContext = createContext();
export function ThemeProvider({ children }) {
    const [theme, setTheme] = React.useState('light');
    return <ThemeContext.Provider value={{ theme, setTheme }}>
        {children}
    </ThemeContext.Provider>
}
export function useTheme() {
    return useContext(ThemeContext);
}

export default ThemeContext;