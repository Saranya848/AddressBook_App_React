import './App.css';
import AddressBookForm from "./components/book-form/addressbook";
import Dashboard from "./components/dashboard/dashboard";
import {Route, BrowserRouter as Router, Switch} from "react-router-dom";

function App() {
  return (
      <Router>
          <div className="App">
              <Switch>
                  <Route exact path="/" component={Dashboard}/>
                  <Route exact path="/form" component={AddressBookForm}/>
                  <Route exact path="/form/:id" component={AddressBookForm}/>
              </Switch>
          </div>
      </Router>
  );
}

export default App;
