(defproject lein-catnip "0.6.0-SNAPSHOT"
  :description "The irresistible Clojure IDE-in-a-plugin"
  :url "https://github.com/bodil/catnip"
  :license {:name "Mozilla Public License"
            :url "http://www.mozilla.org/MPL/2.0/"}
  :dependencies [[leinjacker "0.4.1"]]
  :repositories {"local" 
                   ~(str (.toURI 
                         (java.io.File. "maven_repository")))}
  :eval-in-leiningen true)
