(ns project-management.core
(:require
    #_[om.core :as om :include-macros true]
    [sablono.core :as sab :include-macros true]
    [cljs.test :as t :include-macros true])
  (:require-macros
    [devcards.core :as dc :refer [defcard deftest]]))

(defcard
  "# Using [Devcards](https://github.com/bhauman/devcards) for Project Management

   One of the things I am terrible at is long term management of software projects.
   I'm the only developer on them and have a lot of control over the schedule and
   priorities. I've tried a number of different tools and applications to try and
   help out with this, but there are a few issues that have made me give up on them.

   * Too much overhead - Often built for teams with project managers and supervision,
   I don't need that much info
   * Not flexible enough - I don't want to box myself in to what someone else thinks I need,
   and I want the power to be able to change things to suit the projects or as I experiment
   * Not powerful enough - Some of the tools just can't do what I want
   * Slow - If I have to wait for a page refresh, I'm going to get bored and give up

   Recently I started to experiment with managing my projects using Clojure, writing pages for
   each project and using basic todo lists to track what had to happen. It worked pretty well,
   but didn't add enough to make it worthwhile.

   This is my attempt to figure out how to use Devcards to manage software projects and tasks.")

(defcard
  "# Why?

  There are a few things that I think can be combined for a lot of power and flexbility

  * Markdown - All of this prose is written in markdown. It means I can add links and text in wherever
  I need it, and makes it really easy to both format my explanations and understanding of items as well
  as making it easy to link concepts or tasks together.
  * Figwheel - I never want to be without it. I've used other editors to write markdown before, and the combination
  of my normal IDE or text editor and figwheel is easily the equivalent of any of them.
  * ClojureScript - This is really the best part. I can use all of the power of ClojureScript anywhere I want.
  If I have a component to build, I can do it within a the same devcard that is tracking my todo tasks. If I
  want to change how I am presenting a list of items that need to be done, I can format it using CLJS. Really,
  I can do anything I can think of, and can treat every item in a natural way that makes sense to me.
  * Garden - I can format, and style things on the fly. Using devcards, I can create multiple cards that call the
  same component and experiment with different styles.
  * Structural Flexbility - I can move items into different namespaces, stack them together, split them apart,
   and whatever else I want to do with them.
  * Experimentation - I don't know how this is going to work, but it doesn't really matter! Every time I experiment
  with something new, I get more experience thinking and working within my normal development environment. By managing
  my work with the same tools I am building things with, I can stay in one mode of thought throughout all of my work.
  * Documentation - Once I've completed a task, I can copy the entire devcard out to the project that I have been working
  on and edit my thoughts and experiments to create documentation and context around that component.
  * Publication - If I need to share things with others, it's easy enough to deploy either internally, copy dev cards
  out to another project, or put up on an external host. Also pretty easy to pull things out if I want to open source
  any components.
  * Inspiration - Project management doesn't inspire me at all. ClojureScript development does.

  # Examples
  I'm going to populate this page with examples of some of the patterns that have worked.
  If there are components that help with this, I'll put them in as well. Since this is still
  an early experiment, there might not be much here for a while")

(deftest using-deftest-as-todo-list
         "Since deftest is already there, let's see if it's a good way to build a todo list. A cool part of this
         is that we can actually add in tests as we determine our needs so we have a running tally of tested
         and working items that can populate tests in our project. For items that are less technical,
         we can just throw in some guaranteed failing tests until they are complete."
         (t/is (and "Completed first phase of research" false))
         "Pretty simple, relatively explanatory. Once the item is completed, we just change it to"
         (t/is (and "Completed first phase of research" true))

         )
