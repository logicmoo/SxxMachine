# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.5

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /opt/logicmoo_workspace/taupl/SxxMachine

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /opt/logicmoo_workspace/taupl/SxxMachine

# Include any dependencies generated for this target.
include CMakeFiles/SxxMachine.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/SxxMachine.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/SxxMachine.dir/flags.make

CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o: CMakeFiles/SxxMachine.dir/flags.make
CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o: src/SxxMachine.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/opt/logicmoo_workspace/taupl/SxxMachine/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o -c /opt/logicmoo_workspace/taupl/SxxMachine/src/SxxMachine.cpp

CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /opt/logicmoo_workspace/taupl/SxxMachine/src/SxxMachine.cpp > CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.i

CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /opt/logicmoo_workspace/taupl/SxxMachine/src/SxxMachine.cpp -o CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.s

CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.requires:

.PHONY : CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.requires

CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.provides: CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.requires
	$(MAKE) -f CMakeFiles/SxxMachine.dir/build.make CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.provides.build
.PHONY : CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.provides

CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.provides.build: CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o


# Object files for target SxxMachine
SxxMachine_OBJECTS = \
"CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o"

# External object files for target SxxMachine
SxxMachine_EXTERNAL_OBJECTS =

SxxMachine: CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o
SxxMachine: CMakeFiles/SxxMachine.dir/build.make
SxxMachine: CMakeFiles/SxxMachine.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/opt/logicmoo_workspace/taupl/SxxMachine/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable SxxMachine"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/SxxMachine.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/SxxMachine.dir/build: SxxMachine

.PHONY : CMakeFiles/SxxMachine.dir/build

CMakeFiles/SxxMachine.dir/requires: CMakeFiles/SxxMachine.dir/src/SxxMachine.cpp.o.requires

.PHONY : CMakeFiles/SxxMachine.dir/requires

CMakeFiles/SxxMachine.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/SxxMachine.dir/cmake_clean.cmake
.PHONY : CMakeFiles/SxxMachine.dir/clean

CMakeFiles/SxxMachine.dir/depend:
	cd /opt/logicmoo_workspace/taupl/SxxMachine && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /opt/logicmoo_workspace/taupl/SxxMachine /opt/logicmoo_workspace/taupl/SxxMachine /opt/logicmoo_workspace/taupl/SxxMachine /opt/logicmoo_workspace/taupl/SxxMachine /opt/logicmoo_workspace/taupl/SxxMachine/CMakeFiles/SxxMachine.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/SxxMachine.dir/depend
